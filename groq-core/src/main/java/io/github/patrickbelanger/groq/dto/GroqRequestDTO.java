// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package io.github.patrickbelanger.groq.dto;

import io.github.patrickbelanger.groq.dto.requests.MessageDTO;

import java.util.ArrayList;
import java.util.List;

public class GroqRequestDTO {
    private List<MessageDTO> messages;
    private String model;

    public GroqRequestDTO() {
        this.messages = new ArrayList<MessageDTO>();
    }

    public GroqRequestDTO(List<MessageDTO> messages) {
        this.messages = messages;
    }

    public List<MessageDTO> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageDTO> messages) {
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "GroqRequestDTO{messages=%s, model='%s'}"
            .formatted(messages, model);
    }
}