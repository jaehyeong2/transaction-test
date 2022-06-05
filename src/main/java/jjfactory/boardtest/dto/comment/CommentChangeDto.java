package jjfactory.boardtest.dto.comment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CommentChangeDto {
    private String content;
    private Long commentId;
}
