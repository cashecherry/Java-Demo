class demo{
    void m(){
     try{
          throw new java.io.IOException("device error");//checked exception
    }catch(Exception e){System.out.println("exception handeled");}
    }
    void n(){
      m();
    }
    void p(){
     try{
      n();
     }
     catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
     demo obj=new demo();
     obj.p();
     System.out.println("normal flow");
    }
  }
  