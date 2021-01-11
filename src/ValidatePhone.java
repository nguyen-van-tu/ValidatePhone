import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private String phoneNumber;

    public ValidatePhone() {
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void regexPhoneNum() {
        boolean check = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập sđt");
            String phoneNum = sc.nextLine();
            String regex = "^[\\(0-9]{2,}\\)-\\(0+[0-9]{9}\\)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNum);
            if (matcher.find()) {
                setPhoneNumber(phoneNum);
                System.out.println("Bạn đã nhập đúng");
                check = true;
            } else {
                System.out.println("Bạn đã nhập sai");
            }
        } while (check == false);
    }
}
