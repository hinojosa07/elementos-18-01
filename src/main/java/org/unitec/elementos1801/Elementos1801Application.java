package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner{
    
@Autowired RepositorioMensajito repoMensa; //inyeccion de dependencias

	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
     //repoMensa.save(new Mensajito("17 de octubre","No temblo"));
     
     //Mensajito m=repoMensa.findOne(1);
        System.out.println("Vamos a buscar todos");
        
       //for( Mensajito mensa:repoMensa.findAll()){ 
         //  System.out.println(mensa.getTitulo());
           
         //muestra la direccion puros numeritos raros
            for( Mensajito mensa:repoMensa.findAll()){
           System.out.println(mensa);   
           }
            
            //select where id=
          System.out.println("Vamos a buscar por id");
          System.out.println(repoMensa.findOne(1)); 
          
          //Actualizar
          repoMensa.save(new Mensajito(1,"Nuevo titulo","Nuevo cuerpo"));
          System.out.println(repoMensa.findOne(1));
          
          //Busqueda personalizada 
          
          for(Mensajito mensa:repoMensa.findByTitulo("Nuevo titulo")){
              System.out.println(mensa);
          }
    }
}
