package org.chzz.market.domain.user.dto.response;

import org.chzz.market.domain.user.entity.User;

public record UserProfileResponse(
        String nickname,
        String bio,
        ParticipationCountsResponse participantCount,
        Long preRegisterCount,
        Long registeredAuctionCount
) {
    public static UserProfileResponse of(User user,
                                         ParticipationCountsResponse counts,
                                         Long preRegisterCount,
                                         Long registeredAuctionCount) {
        return new UserProfileResponse(
                user.getNickname(),
                user.getBio(),
                counts,
                preRegisterCount,
                registeredAuctionCount
        );
    }
}
