package tech.wetech.weshop.query;

import io.swagger.annotations.ApiModelProperty;
import tech.wetech.weshop.utils.Constants;

/**
 * @author cjbi
 */
public class GoodsIssuePageQuery {

    @ApiModelProperty("页面大小")
    private Integer pageSize = Constants.DEFAULT_PAGE_SIZE;

    @ApiModelProperty("页码")
    private Integer pageNum = Constants.DEFAULT_PAGE_NUM;

    private String question;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
