package top.sinch.blog.article.service.impl;

import top.sinch.blog.article.entity.Chat;
import top.sinch.blog.article.mapper.ChatMapper;
import top.sinch.blog.article.service.IChatService;
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
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements IChatService {

}
