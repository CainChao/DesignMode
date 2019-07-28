package creat.factory.factorymethod;


import creat.factory.commonfactory.Sender;
import creat.factory.commonfactory.SmsSender;

/**
 * @author CainChao
 * @create 2019-07-28 17:31
 * @desc ${DESCRIPTION}
 **/
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
