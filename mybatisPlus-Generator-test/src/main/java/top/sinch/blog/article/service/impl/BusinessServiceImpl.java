package top.sinch.blog.article.service.impl;

import top.sinch.blog.article.entity.Business;
import top.sinch.blog.article.mapper.BusinessMapper;
import top.sinch.blog.article.service.IBusinessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商户表 服务实现类
 * </p>
 *
 * @author sincH
 * @since 2019-08-29
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {

}
