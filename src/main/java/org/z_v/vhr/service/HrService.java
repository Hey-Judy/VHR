package org.z_v.vhr.service;
/*
    * @ClassName: UserService
    * @Description:TODO
    * @author: Z_V
    * @date: 2020年09月21日 0:30
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.z_v.vhr.mapper.HrMapper;
import org.z_v.vhr.model.Hr;

import java.util.Collection;

/*
 *Create ON 2020/9/21 0:44 BY Z_V HrService
 *33B2实现 UserDetailsService
 *TO HrMapper
 */
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*
         *Create ON 2020/9/21 1:29 BY Z_V
         * To HrMapper
         */
        Hr hr = hrMapper.loadUserByUsername(username);
        if(hr==null){
            throw new UsernameNotFoundException("用户名不存在1！");
        }
        return hr;
    }
}
