public class Animal {

	String nombre;
	int edad;
	String ladrar;
	String maullar;
	String hablar;
	
	Animal(String nombre, int edad)//Constructor a de Animal
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	String getNombre()//funcion nombre
	{
		return nombre;
	}
	
	int getEdad()//funcion edad
	{
		return edad;
	}
	
	void setNombre(String nombre)//
	{
		this.nombre = nombre;
	}
	
	void setEdad(int edad)
	{
		this.edad = edad;
	}
}