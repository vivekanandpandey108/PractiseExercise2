public class Palindrome {
    public boolean checker(String str)
    {
            String reverse = "";
            for (int i = str.length()-1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            System.out.print(reverse);
            if(str.equals(reverse))
                return true;
            else
                return false;

    }
}
