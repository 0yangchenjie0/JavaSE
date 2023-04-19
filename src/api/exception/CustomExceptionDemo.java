package api.exception;
/**
 * 登录   内置账号 jack 密码123456
 * 用户名不存在抛出 UsernameNotFoundException   输出errcode-1001
 * 密码错误抛出 PasswordErrorException          输出errcode-1002
 */
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            login("jak", "123456");
        } catch (UsernameNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e.getErrCode() + ":" + e.getMessage());
        } catch (PasswordErrorException e) {
//            e.printStackTrace();
            System.out.println(e.getErrCode() + ":"+ e.getMessage());
        }
    }

    /**
     * 用户名密码登录
     *
     * @param username 用户名
     * @param password 密码
     *                 //     * @throws UsernameNotFoundException 用户名不存在
     *                 //     * @throws PasswordErrorException 密码错误
     */

    public static void login(String username, String password) throws UsernameNotFoundException, PasswordErrorException {
        if (!"jack".equals(username)) {
            //抛出用户名不存在的异常
            throw new UsernameNotFoundException(1001, "用户名不存在");
        }
        if (!"123456".equals(password)) {
            throw new PasswordErrorException(1002, "密码错误");
        }
        System.out.println("登陆成功");
    }
}

class UsernameNotFoundException extends Exception {
    private int errCode;
    public UsernameNotFoundException(int erroCode, String msg) {
        super(msg);
        this.errCode = erroCode;
    }
    public int getErrCode() {
        return errCode;
    }
}

class PasswordErrorException extends Exception {
    private int errCode;
    public PasswordErrorException(int erroCode, String msg) {
        super(msg);
        this.errCode = erroCode;
    }
    public int getErrCode() {
        return errCode;
    }
}

