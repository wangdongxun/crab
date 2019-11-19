package sms;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * @ClassName SmsAliyun
 * @Description: TODO
 * @Author wangdongxun
 * @Date 2019/10/25
 * @Version V1.0
 **/
public class SmsAliyun {

    //阿里云
    static final String aliyun_domain = "dysmsapi.aliyuncs.com";
    static final String aliyun_accessKeyId = "LTAI4FmYrNw6Pr8FjGDaJefS";
    static final String aliyun_accessKeySecret = "ZDYHtwb4ygmBCLFk1XL5TCShiTPK64";



    /**
     * 短信通道-阿里云
     * @param channel
     * @param num
     * @param sendNum
     * @param templateParam
     * @param signName
     * @param templateCode
     * @return 1:success 0:failed
     */
    private static void sendSmsAliYun(String phone, String templateParam, String signName,
                                     String templateCode) throws Exception {
        DefaultProfile profile = DefaultProfile.getProfile("default", aliyun_accessKeyId, aliyun_accessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setVersion("2017-05-25");
        request.setDomain(aliyun_domain);
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "default");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", signName);
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", templateParam);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception
    {
        SmsAliyun.sendSmsAliYun("18100625522","{code:\"67853\"}","1徐州市市民卡有限公司","SMS_176520393");
    }
}
