/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface SpeechTranscriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.SpeechTranscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative alternatives = 1;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative>
      getAlternativesList();
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative alternatives = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative getAlternatives(
      int index);
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative alternatives = 1;
   * </code>
   */
  int getAlternativesCount();
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative alternatives = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternativeOrBuilder>
      getAlternativesOrBuilderList();
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternative alternatives = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.SpeechRecognitionAlternativeOrBuilder
      getAlternativesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag of the language in this result. This language code was
   * detected to have the most likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag of the language in this result. This language code was
   * detected to have the most likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
