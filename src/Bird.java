public class Bird{
    public int vida;
    public String nombre,color,habilidad,forma;

    public Bird(String nombre, String color, String habilidad, String forma, int vida){
        this.nombre = nombre;
        this.color = color;
        this.habilidad = habilidad;
        this.forma = forma;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getForma() {
        return getForma();
    }
    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida =vida;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Habilidad: " + this.habilidad);
        System.out.println("Forma: " + this.forma);
        System.out.println("Vida: " + this.vida);
    }
}

class Red extends Bird {
    public Red(String nombre, String color, String habilidad, String forma, int vida)
    {
        super(nombre,color,habilidad,forma,vida);
    }
    public void imprimir() {
        System.out.println("El pájaro Red atacó.");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Habilidad: " + this.habilidad);
        System.out.println("Forma: " + this.forma);
        System.out.println("Vida: " + this.vida);
    }
}

class Blue extends Bird{
    public Blue(String nombre, String color, String habilidad, String forma, int vida)
    {
        super(nombre, color, habilidad, forma, vida);
    }
    public void imprimir() {
        System.out.println("El pájaro Blue atacó y se dividió en 3.");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Habilidad: " + this.habilidad);
        System.out.println("Forma: " + this.forma);
        System.out.println("Vida: " + this.vida);
    }
}

class Chuck extends Bird{
    public Chuck(String nombre, String color, String habilidad, String forma, int vida)
    {
        super(nombre,color,habilidad,forma,vida);
    }
    public void imprimir() {
        System.out.println("El pájaro Chuck atacó y se hizo más veloz.");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Habilidad: " + this.habilidad);
        System.out.println("Forma: " + this.forma);
        System.out.println("Vida: " + this.vida);
    }
}






