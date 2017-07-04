package xyz.shy.ik;

import org.junit.Test;
import xyz.shy.ik.SplitWordUtils;

/**
 * Created by Shy on 2017/6/28.
 */
public class SplitWordUtilsTest {
    @Test
    public void ikSplit() throws Exception {
        String text = "验房需要检查的项目非常多，普通业主往往缺乏验房经验和专业工具，很多人只能看到外表显现的问题，而卫生间的防水，电路的走向等隐蔽的工程问题很难发现，有没有什么更好的办法来完成装修后的验收工作呢。";
        String result = SplitWordUtils.ikSplit(text);
        System.out.println(text);
        System.out.println(result);
    }

}