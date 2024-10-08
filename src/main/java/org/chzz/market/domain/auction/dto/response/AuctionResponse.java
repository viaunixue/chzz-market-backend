package org.chzz.market.domain.auction.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import org.chzz.market.domain.auction.dto.BaseAuctionDTO;

/**
 * 진행중인 경매 목록 조회 DTO
 */
@Getter
public class AuctionResponse extends BaseAuctionDTO {
    private final Long id;
    @JsonInclude(Include.NON_NULL)
    private Boolean isParticipating;

    @QueryProjection
    public AuctionResponse(Long id, String name, String cdnPath, Long timeRemaining, Long minPrice,
                           Long participantCount, Boolean isParticipating) {
        super(name, cdnPath, timeRemaining, minPrice, participantCount);
        this.id = id;
        this.isParticipating = isParticipating;
    }

    @QueryProjection
    public AuctionResponse(Long id, String name, String cdnPath, Long timeRemaining, Long minPrice,
                           Long participantCount) {
        super(name, cdnPath, timeRemaining, minPrice, participantCount);
        this.id = id;
    }
}
