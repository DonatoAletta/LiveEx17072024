public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona.PersonaBuilder().setAddress("Via Gasperi").setNome("Marco").build();
        Persona manager = new Persona.PersonaBuilder().setAddress("Via Gasperi").setNome("Carlo").build();
        PersonaManager personaManager = PersonaManager.getInstance();
        PersonaManager personaManager1 = PersonaManager.getInstance();

        System.out.println(personaManager.hashCode());
        System.out.println(personaManager1.hashCode());

        System.out.println(persona.toString());


    }
}