package com.fabiocanedoleao.user_request_batch.domain;

import com.fabiocanedoleao.user_request_batch.dto.UserDTO;
import lombok.Getter;

import java.util.List;

@Getter
public class ResponseUser {private List<UserDTO> content;}
