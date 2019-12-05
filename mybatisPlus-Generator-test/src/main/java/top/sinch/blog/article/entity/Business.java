package top.sinch.blog.article.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商户表
 * </p>
 *
 * @author sincH
 * @since 2019-08-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Business对象", description="商户表")
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商户名称")
    private String name;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "商户类型")
    private String kind;

    @ApiModelProperty(value = "支付方式")
    private String pay;

    @ApiModelProperty(value = "服务商")
    private String serviceProvider;

    @ApiModelProperty(value = "商户简称")
    private String briefName;

    @ApiModelProperty(value = "法人")
    private String corporation;

    @ApiModelProperty(value = "终端号")
    private String terminalNum;

    @ApiModelProperty(value = "联系人姓名")
    private String atten;

    @ApiModelProperty(value = "联系方式")
    private Long tele;

    @ApiModelProperty(value = "photo")
    private String photo;

    private String payway;

    private String weiB;

    private Long num;

    private Long createBy;

    private LocalDate createTime;

    private LocalDate updateTime;

    private Integer delSta;


}
