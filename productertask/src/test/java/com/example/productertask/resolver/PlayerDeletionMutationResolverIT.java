package com.example.productertask.resolver;

import com.example.productertask.ProductertaskApplication;
import com.example.productertask.utils.Transformers;
import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import static com.example.productertask.utils.Constants.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = ProductertaskApplication.class)
public class PlayerDeletionMutationResolverIT {

    @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void player_deleted() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource(PLAYER_DELETION_REQUEST_PATH);
        String expectedResponseBody = Transformers.from_json_to_string_line(PLAYER_DELETION_RESPONSE_PATH);
        assertThat(expectedResponseBody).isEqualTo(response.getRawResponse().getBody());
    }
}
