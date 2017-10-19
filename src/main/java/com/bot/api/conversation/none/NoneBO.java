package com.bot.api.conversation.none;

import com.bot.api.core.Conversable;
import com.bot.api.core.LuisDictionary;
import com.bot.api.core.UserMapper;
import com.bot.api.model.kakao.KakaoResponse;
import com.bot.api.model.kakao.Keyboard;
import com.bot.api.model.kakao.Message;
import com.bot.api.model.luis.LUIS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoneBO implements Conversable {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LuisDictionary luisDictionary;

    public KakaoResponse makeKakaoResponse(String userKey, LUIS luisResponse) {
        String text = "";
        Message message = new Message();
        Keyboard keyboard = new Keyboard();

        message.setText(text);
        return KakaoResponse.valueOf(message, keyboard);
    }
}