package per.lzy.demo.param.config.param;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhiyuan
 * @date 2021/1/17 17:11
 */
@Component
public class RequestParameterFilter extends OncePerRequestFilter {
    private static final String XML_PATH = "/test/rest";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        Map<String, Object> parameter = new HashMap<String, Object>();
        // 增加参数
        if (request.getRequestURI().contains(XML_PATH)) {
            parameter.put("format", "xml");
        } else {
            parameter.put("format", "json");
        }

        // 修改参数
        String name = request.getParameter("name");
        if (name.equals("lzy")) {
            parameter.put("name", "lll");
        }

        ParameterRequestWrapper wrapper = new ParameterRequestWrapper(request, parameter);
        filterChain.doFilter(wrapper, response);
    }

}
