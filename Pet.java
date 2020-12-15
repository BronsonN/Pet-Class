public class Pet {
  private int age;
  private String name;
  private String breed;
  private String gender;

  Pet(String _name, int _age, String _breed, String _gender) {
    name = _name;
    age = _age;
    breed = _breed;
    gender = _gender;
  }

  //pet() {

  //}

  public void setName(String _name) {
    name = _name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int _age){
    age = _age;
  }

  public int getAge() {
    return age;
  }

  public void setBreed(String _breed) {
    breed = _breed;
  }

  public String getBreed() {
    return breed;
  }

  public void setGender(String _gender) {
    gender = _gender;
  }

  public String getGender() {
    return gender;
  }

  public String toString() {
    return String.format ("%s, who is %d, is a %s, and he is a %s", name, age, breed, gender);
  }
}
