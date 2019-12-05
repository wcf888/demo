package top.sinch.blog.article.service.impl;

import top.sinch.blog.article.entity.Product;
import top.sinch.blog.article.mapper.ProductMapper;
import top.sinch.blog.article.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sincH
 * @since 2019-08-29
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
