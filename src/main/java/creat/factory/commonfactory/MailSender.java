package creat.factory.commonfactory;

/**
 * @author CainChao
 * @create 2019-07-28 17:00
 * @desc ${DESCRIPTION}
 **/
public class MailSender implements Sender {


    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
