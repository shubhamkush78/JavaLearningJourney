interface Jumpable { 
    void jumpStyle();
    void jumpFactor();
}

class Toy {  }

class Ball extends Toy implements Jumpable { 
    public void jumpStyle(){  }
    public void jumpFactor(){  }
} 

class Animal { } 

class Rabbit extends Animal implements Jumpable { 
    public void jumpStyle(){  }
    public void jumpFactor(){  }
}

class Car { }

class SportsCar extends Car implements Jumpable { 
    public void jumpStyle(){  }
    public void jumpFactor(){  }
}

