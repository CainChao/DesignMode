package creat.factory.commonfactory;

/**
 * @author CainChao
 * @create 2019-07-28 17:07
 * @desc ${DESCRIPTION}
 **/
public class FactoryTest {

    public static void main(String []args){
        SendFactory factory = new SendFactory();
        factory.produce("sms").send();

        //改进版
        factory.produceMail().send();
    }
}
