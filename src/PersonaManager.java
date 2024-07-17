/*
aggiungi persona
stampa persone
 */
import java.util.List;

public class PersonaManager {

    private List<Persona> personas;

    private static PersonaManager instance;

    //Synchronized forza il metodo ad andare in 'coda' quindi in un'ambiente multi-threading
    //forza il metodo ad esser eseguito in single-thread.
    public static synchronized PersonaManager getInstance(){
        if(instance == null){
            instance = new PersonaManager();
        }
        return instance;
    }

    public void aggiungiPersona(Persona persona) throws PersonaAlreadyExistException{

        if(!personas.stream().anyMatch(p -> p.getNome().equals(persona.getNome()))){
            personas.add(persona);
        }else {
            throw new PersonaAlreadyExistException("La persona inserita è già esistente");
        }

    }

    public void stampaPersona(){
        for(Persona persona : personas){
            System.out.println(persona.toString());
        }
    }




}
