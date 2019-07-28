package creat.factory.commonfactory;

/**
 * @author CainChao
 * @create 2019-07-28 17:05
 * @desc ${DESCRIPTION}
 **/
public class SendFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }
        System.out.println("请输入正确的类型");
        return  null;
    }


    //下面是改进版，多个方法

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
