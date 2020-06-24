class Shape{
  public void shape(){
    System.out.println("This is shape");
  }
}
class Rectangle extends Shape{
  public void rect(){
    System.out.println("This is rectangular shape");
  }
}
class Circle extends Shape{
  public void crcl(){
    System.out.println("This is circular shape");
  }
}
class Square extends Rectangle{
  public void sqr(){
    System.out.println("Square is a rectangle");
  }
}

class Main{
  public static void main(String[] args){
    Square s = new Square(); 
    s.shape();   
    s.rect();   
  }
}