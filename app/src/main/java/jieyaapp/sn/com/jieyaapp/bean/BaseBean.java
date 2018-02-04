package jieyaapp.sn.com.jieyaapp.bean;

/**
 * Created by John on 2018/1/21.
 * 做为基类bean，有基本属性
 * 例如：{""}
 */
public class BaseBean {
    /*
    对应{""}
     */
    public int result;
    public String message;
    public int flag;

    /*
    下面是message常量值，用于在其它类做判断用
     */
    //1.请求成功
    public final static int MESSAGE_SUCCESS=1;
    //0.请求失败
    public final static int MESSAGE_FALIED=0;
    //-1.参数解谜错误
    public final static int MESSAGE_DECODE_WRONG=-1;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
