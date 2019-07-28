package creat.factory.factorymethod;


import creat.factory.commonfactory.Sender;

/**
 * @author CainChao
 * @create 2019-07-28 17:32
 * @desc ${DESCRIPTION}
 **/
public class MethodTest {

    public static void main(String [] args){
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
