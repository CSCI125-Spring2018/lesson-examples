package week07;

class Dog
{
    private String name;
    private String sound;

    public Dog()
    {
        // System.out.println("making new dog object");
        this.sound = "bark";
        // setSound("bark");
    }

    public Dog(String name)
    {
        this();
        this.name = name;
    }

    // name accessor
    public String getName()
    {
        return name;
    }

    // name mutator
    public void setName(String name)
    {
        this.name = name;
    }

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    public String toString()
    {
        return String.format("{type: Dog, name: %s, sound: %s}", name, sound);
    }

    public boolean equals(Dog other)
    {
        return other.sound.equals(sound) && other.name.equals(name);
    }


}