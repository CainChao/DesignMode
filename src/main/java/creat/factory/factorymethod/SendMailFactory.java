package creat.factory.factorymethod;


import creat.factory.commonfactory.MailSender;
import creat.factory.commonfactory.Sender;

/**
 * @author CainChao
 * @create 2019-07-28 17:30
 * @desc ${DESCRIPTION}
 **/
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
