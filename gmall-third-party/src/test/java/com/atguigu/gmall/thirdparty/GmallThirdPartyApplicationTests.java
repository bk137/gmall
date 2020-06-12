package com.atguigu.gmall.thirdparty;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GmallThirdPartyApplicationTests {

    @Test
    void contextLoads() {
    }


    @Resource
    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        //String endpoint = "oss-cn-shenzhen.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        //String accessKeyId = "LTAI4FzqGE7qyRBTb1UPtsFN";
        //String accessKeySecret = "2Oc7wARANFj7f3WrVfJm01GhIjVbUk";

        // 创建OSSClient实例。
        //OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


        // 如果需要上传时设置存储类型与访问权限，请参考以下示例代码。
        // ObjectMetadata metadata = new ObjectMetadata();
        // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
        // metadata.setObjectAcl(CannedAccessControlList.Private);
        // putObjectRequest.setMetadata(metadata);

        // 上传文件。
        InputStream inputStream = new FileInputStream("C:\\Users\\29150\\Desktop\\gougou.jpg");
        // 创建PutObjectRequest对象。
        PutObjectRequest putObjectRequest = new PutObjectRequest("gmall-bk137", "haha.jpg", inputStream);

        ossClient.putObject(putObjectRequest);

        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传完成...");
    }
}
