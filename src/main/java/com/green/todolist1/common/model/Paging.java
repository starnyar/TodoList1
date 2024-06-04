package com.green.todolist1.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@ToString
public class Paging {
    @Schema(example = "1", description = "선택한 페이지")
    private int page;
    @Schema(example = "5", description = "페이지 당 게시글 수")
    private int size;
    @JsonIgnore
    private int startIdx;

    @ConstructorProperties({"page", "size"})
    public Paging(Integer page, Integer size) {
        this.page = page;
        this.size = size;
        this.startIdx = (this.page - 1) * size;
    }
}
