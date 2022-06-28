public class Test{
//    private X first;
//    private Y second;
//
//    Test(X a1, Y a2){
//        first = a1;
//        second = a2;
//
//    }
//
//
// //   Integer num =3;
// //   Double num1 = 2.0;
//
//  // public void run() {
//     //  return num;
// //  }
// //  public String run1() {
//   //    return "num";
// //  }
//  // public Double run2() {
//    //   return num1;
// //  }
//  //  public Integer run3() {
//  //      return num;
//  //  }
//    public Integer k() {
//        return (Integer) first;
//    }
//    public String e() {
//        return (String) second;
//    }
//
//
//    public static void main(String[] args) {
//        Test<Integer, String> tt = new Test<Integer, String>(10, "John");
//      //  System.out.println(tt);
//    }
//    public static void main(String[] args) {
//        System.out.println(say());
//    }
//    public static String say(){
//        return "hello";
//    }
//    public void say(){
//        return "hey"
//    }
    public static void printMe() {
        System.out.println("Hey");
        printMe();
    }

    public static void main(String[] args) {
        printMe();
    }
}


