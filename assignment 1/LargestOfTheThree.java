class LargestOfTheThree{
    public static void main(String args[]){
       int a = 10;
       int b = 34;
       int c = 22;
      if(a >= b && a >= c){
         System.out.println("The largest number is:" + a);
}
      else if(b >= a && b >= c){
         System.out.println("The largest number is:" + b); 
}
      else{
         System.out.println("The largest number is:" + c);
}

}

}