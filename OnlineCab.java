//import java.util.Scanner;
//
//public class OnlineCab {
//
//    Scanner obj = new Scanner(System.in);
//
//    public int completed()
//    {
//        return 1;
//    }
//
//    public int trip()
//    {
//        int complete=0;
//        complete = completed();
//        if(complete==1)
//            return 1;
//        else
//            trip();
//    }
//
//    public void invoice()
//    {
//
//    }
//
//    public int book(int type)
//    {
//
//        switch(type)
//        {
//            int b;
//            case 1 :
//                {
//                    trip();
//                    System.out.println("Your Regular trip is completed");
//                    System.out.println("You can generate invoice");
//                    System.out.println("Press 1 for Innervoice");
//                    b=obj.nextInt();
//                    if(b==1)
//                        invoice();
//                    return 0;
//                }
//
//            case 12 :
//            {
//                trip();
//                System.out.println("Your Premium trip is completed");
//                System.out.println("You can generate invoice");
//                System.out.println("Press 1 for Innervoice");
//                b=obj.nextInt();
//                if(b==1)
//                    invoice();
//                return 0;
//            }
//
//            case 3 :
//            {
//                trip();
//                System.out.println("Your Luxury trip is completed");
//                System.out.println("You can generate invoice");
//                System.out.println("Press 1 for Innervoice");
//                b=obj.nextInt();
//                if(b==1)
//                    invoice();
//                return 0;
//            }
//        }
//
//    }
//
//    public void user() {
//        System.out.println("Select the type of cab");
//        System.out.println("Press");
//        System.out.println("1 for regular");
//        System.out.println("2 for premium");
//        System.out.println("3 for luxury");
//        int type = obj.nextInt();
//        book(type);
//    }
//
//    public void main()
//    {
//       System.out.println("Want to ride");
//       System.out.println("Press");
//       System.out.println("1 to ride");
//
//        int r =0 ;
//               r = obj.nextInt();
//        if(r==1) {
//            user();
//        }
//    }
//}
