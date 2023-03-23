public class Animal {

    private String id;
    private String name;
    private String birthdate;

    public Animal(String id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;

    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        return this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String setBirthdate(String birthdate) {
        return this.birthdate = birthdate;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (birthdate == null) {
            if (other.birthdate != null)
                return false;
        } else if (!birthdate.equals(other.birthdate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", имя=" + name + ", дата рождения=" + birthdate + "]";
    }

}
