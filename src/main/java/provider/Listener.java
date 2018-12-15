package provider;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * 类说明：
 *
 * @Author panwenzhuo
 * @Date created in 2018/12/15 17:51
 **/
@Order(LoggingApplicationListener.DEFAULT_ORDER)
public class Listener    implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    private static final String s = "         _ooOoo_             _ooOoo_\n" +
            "                  o8888888o\n" +
            "                  88\" . \"88\n" +
            "                  (| -_- |)\n" +
            "                  O\\  =  /O\n" +
            "               ____/`---'\\____\n" +
            "             .'  \\\\|     |//  `.\n" +
            "            /  \\\\|||  :  |||//  \\\n" +
            "           /  _||||| -:- |||||-  \\\n" +
            "           |   | \\\\\\  -  /// |   |\n" +
            "           | \\_|  ''\\---/''  |   |\n" +
            "           \\  .-\\__  `-`  ___/-. /\n" +
            "         ___`. .'  /--.--\\  `. . __\n" +
            "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n" +
            "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
            "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n" +
            "======`-.____`-.___\\_____/___.-`____.-'======\n" +
            "                   `=---='\n" +
            "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" +
            " ------ 佛祖保佑  ---- 永无BUG  ------";

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println(s);
    }
}
