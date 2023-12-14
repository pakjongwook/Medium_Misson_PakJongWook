package com.mysite.medium.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    // question_form 에 입력 값을 화면에 보이게 하기 위해서 화면의 입력 값을 추가 해야 한다.
    @NotEmpty(message="제목은 필수항목입니다.")
    @Size(max=200)
    private String subject;

    @NotEmpty(message="내용은 필수항목입니다.")
    private String content;

    // @NotNull(message="공개 여부는 필수 입니다.") // Boolean 경우 Not null 을 넣어줘야 함
    // => question_form 에 checkbox 입력 값을 true (check 하면)/ false 만 보내기 때문에 Not null 어노테이션 지워도 된다.
    private Boolean isPublished;

}