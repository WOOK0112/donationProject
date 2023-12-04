package com.myapp.warmwave.domain.user.entity;

import com.myapp.warmwave.domain.address.entity.Address;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@SuperBuilder
@ToString
@DiscriminatorValue("individual")
public class Individual extends User {
    @Column(unique = true)
    private String nickname;

    public void updateIndiInfo(String nickname, String password, Address address) {
        this.nickname = nickname;
        this.updateUserInfo(password, address);
//        this.profileImg = profileImg;
    }
}