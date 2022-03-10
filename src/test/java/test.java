import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @project: fssc-service-image
 * @ClassName: test
 * @author: Qin Wei Chang
 * @creat: 2022/3/10 3:30 下午
 * 描述:1
 */
public class test {


    public static void main(String[] args) {


        String format = DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss.sss");

        System.out.println(format);
    }
}
