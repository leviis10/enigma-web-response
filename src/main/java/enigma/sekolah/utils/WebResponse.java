package enigma.sekolah.utils;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebResponse<T> {
    private String status;
    private String message;
    private T data;
}
