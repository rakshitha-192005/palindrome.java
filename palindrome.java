public class palindrome{
    public static void main(String[]args){
        if(args.length==0){
            system.out.println("please provide a word to check!");
            return;
        }
            string word= args[0];
            if(is palindrome(word)){
                system.out.println(word="is a palindrome!");
            }else{
                system.out.println(word+"is NOT a palindrome!")
            }
    }
    public static boolean ispalindrome(string str){
        string reversed=new stringBuilder(str).reverse().tostring();
        return str.equalslgnoreCase(reversed);
    }
    }    