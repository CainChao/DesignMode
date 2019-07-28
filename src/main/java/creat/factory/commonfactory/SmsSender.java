package creat.factory.commonfactory;

/**
 * @author CainChao
 * @create 2019-07-28 17:03
 * @desc ${DESCRIPTION}
 **/
public class SmsSender implements Sender {


    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
