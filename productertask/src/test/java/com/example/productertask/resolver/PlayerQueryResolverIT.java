package com.example.productertask.resolver;

import com.example.productertask.ProductertaskApplication;
import com.example.productertask.utils.Transformers;
import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import static com.example.productertask.utils.Constants.PLAYER_QUERY_REQUEST_PATH;
import static com.example.productertask.utils.Constants.PLAYER_QUERY_RESPONSE_PATH;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = ProductertaskApplication.class)
public class PlayerQueryResolverIT {
    @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void players_listed() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(PLAYER_QUERY_REQUEST_PATH);
        String expectedResponseBody = Transformers.from_json_to_string_line(PLAYER_QUERY_RESPONSE_PATH);
        assertThat(expectedResponseBody).isEqualTo(response.getRawResponse().getBody());
    }
}
