public class Checker {

    //number of chars : the Higher the Better("password must be greater than 8 chars"){done}
    //combination of uppercase and lowercase{done}
    //contains numbers{done}
    //non repeated characters (every char is different ascii char){done}
    //is not a consecutive password ie 123456789 or 987654321{done}
    //is not blank ("[space]"){done} 


    int pLength;
    final int MAX_STRENGTH = 10;
    int pStrength = 0;
    String pass;

    public Checker(String pwd){
        pass = pwd;
        pLength = pwd.length();

    }

    public void checkSecurity(){
        if(pass.isEmpty()){
            System.out.println("Password Field is Empty! Password is Very Insecure.");
        }
        if(pLength >= 8){
            pStrength++;
            if(pLength >= 12){
                pStrength++;
                if(pLength >= 16){
                    pStrength++;
                }
            }
        }
        if(hasUpperCase(pass) && hasLowerCase(pass)){
            pStrength+=2;
        }
        if(containsNumbers(pass)){
            pStrength+=2;
        }
        if(hasNoRepeats(pass)){
            pStrength+=2;
        }
        if(!containsConsecutiveNums(pass)){
            pStrength++;
        }

        System.out.println("Your password strength is rated at " + pStrength +"/" + MAX_STRENGTH);

    }


    //Component Methods

    public boolean hasUpperCase(String str){
        for(int i = 0; i<pLength; i++){
            if(Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;

    }

    public boolean hasLowerCase(String str){
        for(int i  = 0; i<pLength; i++){
            if(Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean containsNumbers(String str){
        for(int i = 0; i<pLength; i++){
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean hasNoRepeats(String str){
        for(int i = 0; i<pLength; i++)
            if(containsChar(str, str.charAt(i))){
                return false;
            }
        return true;
    }


    public boolean containsChar(String s, char search) {
        if (s.length() == 0)
            return false;
        else
            return s.charAt(0) == search || containsChar(s.substring(1), search);
    }

    public boolean containsConsecutiveNums(String str){
        for(int i = 0; i<pLength; i++){
            if(Character.isDigit(str.charAt(i))){
                if(str.charAt(i)-1 == str.charAt(i-1) || str.charAt(i)+1 == str.charAt(i+1)){
                    return true;
                }
            }
        }
        return false;
    }
}
