public class Persona {

    private String nome;
    private String cognome;
    private String address;

    public Persona(PersonaBuilder personaBuilder) {
        this.nome = personaBuilder.getNome();
        this.cognome = personaBuilder.getCognome();
        this.address = personaBuilder.getAddress();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class PersonaBuilder {

        private String nome;
        private String cognome;
        private String address;

        public PersonaBuilder(){}

        public PersonaBuilder(String nome, String cognome, String address){
            this.address =  address;
            this.nome = nome;
            this.cognome = cognome;
        }

        public String getNome() {
            return nome;
        }

        public String getCognome() {
            return cognome;
        }

        public String getAddress() {
            return address;
        }

        public PersonaBuilder setNome(String nome){
            this.nome = nome;
            return this;
        }

        public PersonaBuilder setCognome(String cognome){
            this.cognome = cognome;
            return this;
        }

        public PersonaBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public Persona build(){
            return new Persona(this);
        }


    }

}


